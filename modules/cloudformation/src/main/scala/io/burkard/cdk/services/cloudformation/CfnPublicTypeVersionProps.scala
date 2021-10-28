package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublicTypeVersionProps {

  def apply(
    arn: Option[String] = None,
    typeName: Option[String] = None,
    logDeliveryBucket: Option[String] = None,
    publicVersionNumber: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps.Builder)
      .arn(arn.orNull)
      .typeName(typeName.orNull)
      .logDeliveryBucket(logDeliveryBucket.orNull)
      .publicVersionNumber(publicVersionNumber.orNull)
      .`type`(`type`.orNull)
      .build()
}
