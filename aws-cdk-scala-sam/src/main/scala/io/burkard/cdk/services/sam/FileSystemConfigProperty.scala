package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSystemConfigProperty {

  def apply(
    arn: Option[String] = None,
    localMountPath: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty.Builder)
      .arn(arn.orNull)
      .localMountPath(localMountPath.orNull)
      .build()
}
