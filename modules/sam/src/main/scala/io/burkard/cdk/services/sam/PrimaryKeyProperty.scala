package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrimaryKeyProperty {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty =
    (new software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}
