package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatisticOverrideProperty {

  def apply(
    statistic: String,
    parameters: software.amazon.awscdk.services.databrew.CfnJob.ParameterMapProperty
  ): software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.Builder)
      .statistic(statistic)
      .parameters(parameters)
      .build()
}
