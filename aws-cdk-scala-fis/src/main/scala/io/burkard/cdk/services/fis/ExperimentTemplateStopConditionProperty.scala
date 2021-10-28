package io.burkard.cdk.services.fis

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExperimentTemplateStopConditionProperty {

  def apply(
    source: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder)
      .source(source.orNull)
      .value(value.orNull)
      .build()
}
