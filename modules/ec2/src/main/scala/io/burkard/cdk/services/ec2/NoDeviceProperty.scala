package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NoDeviceProperty {

  def apply: software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty.Builder)
      
      .build()
}