package is.dream.media.controller;

import is.dream.common.Result;
import is.dream.media.exception.MediaBusinessException;
import is.dream.media.service.VideoBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author chendongzhao
 * @version 1.0
 * @date 2020/6/16 20:39
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoBusinessService videoBusinessService;

    @PostMapping("/upload")
    public Result<Object> upload(@ModelAttribute("file") MultipartFile file, @RequestParam("name") String name,@RequestParam("type") String type,
                                 @RequestParam("tag") String tag, @RequestParam("title") String title,@RequestParam("subtitle") String subtitle,
                                 @RequestParam("year") String year,@RequestParam("introduction") String introduction,@RequestParam("startTime") String startTime
                                 ) throws MediaBusinessException{

        return videoBusinessService.upload(file,name,type,tag,title,subtitle,year,introduction,startTime,false,null);
    }

    @CrossOrigin
    @GetMapping("/getVideoById")
    public Result<Object> getVideoById(@RequestParam("id") String id) {

        return videoBusinessService.getVideoById(id);
    }

}
