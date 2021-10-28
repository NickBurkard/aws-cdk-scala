package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TarballImageAssetProps {

  def apply(
    tarballFile: Option[String] = None
  ): software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps =
    (new software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.Builder)
      .tarballFile(tarballFile.orNull)
      .build()
}
