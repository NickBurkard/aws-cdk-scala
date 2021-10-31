package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FontProperty {

  def apply(
    fontFamily: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTheme.FontProperty.Builder)
      .fontFamily(fontFamily.orNull)
      .build()
}
