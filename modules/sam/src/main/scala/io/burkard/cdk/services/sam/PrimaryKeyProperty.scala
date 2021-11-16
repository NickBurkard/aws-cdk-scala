package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrimaryKeyProperty {

  def apply(
    `type`: String,
    name: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty =
    (new software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder)
      .`type`(`type`)
      .name(name.orNull)
      .build()
}
