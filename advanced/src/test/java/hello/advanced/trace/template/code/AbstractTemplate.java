package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;


/**
 * <pre>
 *     작성일 : 24.01.01
 *     강의명 : 김영한 스프링핵심원리 고급편
 *     설명 :
 *            1. 템플릿 메서드 패턴을 적용하기 위한 추상클래스
 *            2. 변하는 부분 : log.info부분
 *               변하지 않는 부분 : 그 외
 *     ※ 변하는 부분과 변하지 않는 부분을 분리하기 위한 작업이다.
 *
 *     연계 클래스 : TemplateMethodTest, SubClassLogic1,2
 *     기타 : abstract call -> SubClassLogic으로 연계된다.
 * </pre>
 */
@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
//        log.info("비즈니스 로직1 실행");
        call();//상속
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;

        log.info("resultTime={}",resultTime);
    }

    protected abstract void call();
}
