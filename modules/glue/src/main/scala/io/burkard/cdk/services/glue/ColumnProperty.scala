package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnProperty {

  def apply(
    name: Option[String] = None,
    comment: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTable.ColumnProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.ColumnProperty.Builder)
      .name(name.orNull)
      .comment(comment.orNull)
      .`type`(`type`.orNull)
      .build()
}
