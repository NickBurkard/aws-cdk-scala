package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCEndpointConnectionNotificationProps {

  def apply(
    connectionNotificationArn: Option[String] = None,
    connectionEvents: Option[List[String]] = None,
    serviceId: Option[String] = None,
    vpcEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.Builder)
      .connectionNotificationArn(connectionNotificationArn.orNull)
      .connectionEvents(connectionEvents.map(_.asJava).orNull)
      .serviceId(serviceId.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
