package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LinuxUserDataOptions {

  def apply(
    shebang: Option[String] = None
  ): software.amazon.awscdk.services.ec2.LinuxUserDataOptions =
    (new software.amazon.awscdk.services.ec2.LinuxUserDataOptions.Builder)
      .shebang(shebang.orNull)
      .build()
}
