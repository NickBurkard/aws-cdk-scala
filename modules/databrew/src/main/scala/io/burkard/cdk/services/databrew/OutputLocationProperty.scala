package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputLocationProperty {

  def apply(
    bucket: String,
    key: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.Builder)
      .bucket(bucket)
      .key(key.orNull)
      .build()
}
