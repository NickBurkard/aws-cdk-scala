package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCell {

  def apply(
    internalResourceId: String,
    cellName: String,
    cells: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoveryreadiness.CfnCell =
    software.amazon.awscdk.services.route53recoveryreadiness.CfnCell.Builder
      .create(stackCtx, internalResourceId)
      .cellName(cellName)
      .cells(cells.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
