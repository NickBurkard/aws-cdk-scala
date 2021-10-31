package io.burkard.cdk.services.elasticsearch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VPCOptionsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
