package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputRecordTablesProperty {

  def apply(
    glueTables: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.Builder)
      .glueTables(glueTables.map(_.asJava).orNull)
      .build()
}
