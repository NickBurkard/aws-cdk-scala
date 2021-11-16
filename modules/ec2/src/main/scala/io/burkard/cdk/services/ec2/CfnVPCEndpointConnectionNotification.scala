package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCEndpointConnectionNotification {

  def apply(
    internalResourceId: String,
    connectionNotificationArn: String,
    connectionEvents: List[String],
    serviceId: Option[String] = None,
    vpcEndpointId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification =
    software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder
      .create(stackCtx, internalResourceId)
      .connectionNotificationArn(connectionNotificationArn)
      .connectionEvents(connectionEvents.asJava)
      .serviceId(serviceId.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
