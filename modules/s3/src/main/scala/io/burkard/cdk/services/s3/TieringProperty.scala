package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TieringProperty {

  def apply(
    accessTier: String,
    days: Number
  ): software.amazon.awscdk.services.s3.CfnBucket.TieringProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.TieringProperty.Builder)
      .accessTier(accessTier)
      .days(days)
      .build()
}
