package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SizeConversionOptions {

  def apply(
    rounding: Option[software.amazon.awscdk.SizeRoundingBehavior] = None
  ): software.amazon.awscdk.SizeConversionOptions =
    (new software.amazon.awscdk.SizeConversionOptions.Builder)
      .rounding(rounding.orNull)
      .build()
}
