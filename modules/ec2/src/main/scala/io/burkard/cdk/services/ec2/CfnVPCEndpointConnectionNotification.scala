package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointConnectionNotification {

  def apply(
    internalResourceId: String,
    connectionNotificationArn: Option[String] = None,
    connectionEvents: Option[List[String]] = None,
    serviceId: Option[String] = None,
    vpcEndpointId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification =
    software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder
      .create(stackCtx, internalResourceId)
      .connectionNotificationArn(connectionNotificationArn.orNull)
      .connectionEvents(connectionEvents.map(_.asJava).orNull)
      .serviceId(serviceId.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
