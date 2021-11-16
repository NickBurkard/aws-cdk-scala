package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlTranslationProperty {

  def apply(
    owner: String
  ): software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder)
      .owner(owner)
      .build()
}
