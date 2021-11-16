package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowEntitlementProps {

  def apply(
    name: String,
    subscribers: List[String],
    description: String,
    flowArn: String,
    dataTransferSubscriberFeePercent: Option[Number] = None,
    encryption: Option[software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty] = None,
    entitlementStatus: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps.Builder)
      .name(name)
      .subscribers(subscribers.asJava)
      .description(description)
      .flowArn(flowArn)
      .dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent.orNull)
      .encryption(encryption.orNull)
      .entitlementStatus(entitlementStatus.orNull)
      .build()
}
