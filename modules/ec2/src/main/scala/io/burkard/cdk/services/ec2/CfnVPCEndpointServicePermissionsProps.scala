package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointServicePermissionsProps {

  def apply(
    allowedPrincipals: Option[List[String]] = None,
    serviceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.Builder)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .serviceId(serviceId.orNull)
      .build()
}
