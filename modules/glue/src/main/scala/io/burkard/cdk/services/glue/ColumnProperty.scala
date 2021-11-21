package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnProperty {

  def apply(
    name: String,
    comment: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty.Builder)
      .name(name)
      .comment(comment.orNull)
      .`type`(`type`.orNull)
      .build()
}
