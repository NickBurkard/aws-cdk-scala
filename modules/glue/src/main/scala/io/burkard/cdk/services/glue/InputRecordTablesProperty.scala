package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputRecordTablesProperty {

  def apply(
    glueTables: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.Builder)
      .glueTables(glueTables.map(_.asJava).orNull)
      .build()
}
