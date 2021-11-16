package io.burkard.cdk.services.fis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExperimentTemplateStopConditionProperty {

  def apply(
    source: String,
    value: Option[String] = None
  ): software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty =
    (new software.amazon.awscdk.services.fis.CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder)
      .source(source)
      .value(value.orNull)
      .build()
}
