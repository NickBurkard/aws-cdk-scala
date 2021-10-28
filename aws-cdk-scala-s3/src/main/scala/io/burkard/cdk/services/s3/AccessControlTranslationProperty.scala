package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessControlTranslationProperty {

  def apply(
    owner: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder)
      .owner(owner.orNull)
      .build()
}
