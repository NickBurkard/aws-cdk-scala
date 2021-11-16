package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AcceleratorAttributes {

  def apply(
    acceleratorArn: String,
    dnsName: String
  ): software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes =
    (new software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.Builder)
      .acceleratorArn(acceleratorArn)
      .dnsName(dnsName)
      .build()
}
