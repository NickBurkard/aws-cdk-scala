package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
