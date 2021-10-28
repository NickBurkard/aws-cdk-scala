package io.burkard.cdk.services.route53recoveryreadiness

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCellProps {

  def apply(
    cells: Option[List[String]] = None,
    cellName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps.Builder)
      .cells(cells.map(_.asJava).orNull)
      .cellName(cellName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
