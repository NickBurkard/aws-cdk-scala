package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SheetProperty {

  def apply(
    name: Option[String] = None,
    sheetId: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.SheetProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.SheetProperty.Builder)
      .name(name.orNull)
      .sheetId(sheetId.orNull)
      .build()
}
