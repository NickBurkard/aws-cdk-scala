package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagFilterProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
