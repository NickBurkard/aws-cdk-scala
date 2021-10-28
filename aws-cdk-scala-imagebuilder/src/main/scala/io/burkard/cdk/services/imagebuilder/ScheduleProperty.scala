package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduleProperty {

  def apply(
    pipelineExecutionStartCondition: Option[String] = None,
    scheduleExpression: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty.Builder)
      .pipelineExecutionStartCondition(pipelineExecutionStartCondition.orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}
