package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedZone {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    queryLoggingConfig: Option[software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty] = None,
    hostedZoneTags: Option[List[_ <: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty]] = None,
    hostedZoneConfig: Option[software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty] = None,
    vpcs: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnHostedZone =
    software.amazon.awscdk.services.route53.CfnHostedZone.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .queryLoggingConfig(queryLoggingConfig.orNull)
      .hostedZoneTags(hostedZoneTags.map(_.asJava).orNull)
      .hostedZoneConfig(hostedZoneConfig.orNull)
      .vpcs(vpcs.map(_.asJava).orNull)
      .build()
}
