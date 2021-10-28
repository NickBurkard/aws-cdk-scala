package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutputLocationProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .build()
}
