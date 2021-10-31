package io.burkard.cdk.services.opensearchservice

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VPCOptionsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
