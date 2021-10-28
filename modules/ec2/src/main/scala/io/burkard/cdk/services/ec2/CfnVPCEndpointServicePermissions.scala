package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointServicePermissions {

  def apply(
    internalResourceId: String,
    allowedPrincipals: Option[List[String]] = None,
    serviceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions =
    software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder
      .create(stackCtx, internalResourceId)
      .allowedPrincipals(allowedPrincipals.map(_.asJava).orNull)
      .serviceId(serviceId.orNull)
      .build()
}