package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputColumnProperty {

  def apply(
    name: String,
    `type`: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.Builder)
      .name(name)
      .`type`(`type`)
      .build()
}
