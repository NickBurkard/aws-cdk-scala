package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedZoneProps {

  def apply(
    name: String,
    queryLoggingConfig: Option[software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty] = None,
    hostedZoneTags: Option[List[_ <: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty]] = None,
    hostedZoneConfig: Option[software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty] = None,
    vpcs: Option[List[_]] = None
  ): software.amazon.awscdk.services.route53.CfnHostedZoneProps =
    (new software.amazon.awscdk.services.route53.CfnHostedZoneProps.Builder)
      .name(name)
      .queryLoggingConfig(queryLoggingConfig.orNull)
      .hostedZoneTags(hostedZoneTags.map(_.asJava).orNull)
      .hostedZoneConfig(hostedZoneConfig.orNull)
      .vpcs(vpcs.map(_.asJava).orNull)
      .build()
}
