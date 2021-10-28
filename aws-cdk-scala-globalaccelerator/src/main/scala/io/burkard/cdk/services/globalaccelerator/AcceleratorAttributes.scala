package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AcceleratorAttributes {

  def apply(
    acceleratorArn: Option[String] = None,
    dnsName: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes =
    (new software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.Builder)
      .acceleratorArn(acceleratorArn.orNull)
      .dnsName(dnsName.orNull)
      .build()
}
