package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginBindConfig {

  def apply(
    failoverConfig: Option[software.amazon.awscdk.services.cloudfront.OriginFailoverConfig] = None,
    originProperty: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty] = None
  ): software.amazon.awscdk.services.cloudfront.OriginBindConfig =
    (new software.amazon.awscdk.services.cloudfront.OriginBindConfig.Builder)
      .failoverConfig(failoverConfig.orNull)
      .originProperty(originProperty.orNull)
      .build()
}
