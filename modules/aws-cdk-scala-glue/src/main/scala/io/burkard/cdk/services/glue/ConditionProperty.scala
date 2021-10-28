package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConditionProperty {

  def apply(
    jobName: Option[String] = None,
    state: Option[String] = None,
    logicalOperator: Option[String] = None,
    crawlerName: Option[String] = None,
    crawlState: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty =
    (new software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty.Builder)
      .jobName(jobName.orNull)
      .state(state.orNull)
      .logicalOperator(logicalOperator.orNull)
      .crawlerName(crawlerName.orNull)
      .crawlState(crawlState.orNull)
      .build()
}
