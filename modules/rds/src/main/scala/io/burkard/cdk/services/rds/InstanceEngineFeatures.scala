package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceEngineFeatures {

  def apply(
    s3Import: Option[String] = None,
    s3Export: Option[String] = None
  ): software.amazon.awscdk.services.rds.InstanceEngineFeatures =
    (new software.amazon.awscdk.services.rds.InstanceEngineFeatures.Builder)
      .s3Import(s3Import.orNull)
      .s3Export(s3Export.orNull)
      .build()
}
