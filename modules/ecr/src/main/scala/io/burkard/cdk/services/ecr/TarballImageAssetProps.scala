package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TarballImageAssetProps {

  def apply(
    tarballFile: String
  ): software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps =
    (new software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps.Builder)
      .tarballFile(tarballFile)
      .build()
}
