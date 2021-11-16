package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpointServicePermissionsProps {

  def apply(
    serviceId: String,
    allowedPrincipals: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.Builder)
      .serviceId(serviceId)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .build()
}
