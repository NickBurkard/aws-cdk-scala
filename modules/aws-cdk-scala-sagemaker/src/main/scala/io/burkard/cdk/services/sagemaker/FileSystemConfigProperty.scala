package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSystemConfigProperty {

  def apply(
    defaultGid: Option[Number] = None,
    mountPath: Option[String] = None,
    defaultUid: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty.Builder)
      .defaultGid(defaultGid.orNull)
      .mountPath(mountPath.orNull)
      .defaultUid(defaultUid.orNull)
      .build()
}
