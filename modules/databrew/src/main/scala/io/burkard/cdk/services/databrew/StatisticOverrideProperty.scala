package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatisticOverrideProperty {

  def apply(
    statistic: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.databrew.CfnJob.ParameterMapProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.Builder)
      .statistic(statistic.orNull)
      .parameters(parameters.orNull)
      .build()
}
