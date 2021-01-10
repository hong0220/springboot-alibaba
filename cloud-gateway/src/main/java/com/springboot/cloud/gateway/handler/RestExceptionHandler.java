//package com.springboot.cloud.gateway.handler;
//
//@Slf4j
//@RestControllerAdvice
//public class RestExceptionHandler {
//    /**
//     * 默认全局异常处理。
//     *
//     * @return ResultData
//     */
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResultData<String> exception(Exception e) {
//        log.error("全局异常信息 ex={}", e.getMessage(), e);
//        return ResultData.fail(ReturnCode.RC500.getCode(), e.getMessage());
//    }
//}