package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CreateColumnsOperationProperty {

  def apply(
    columns: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.Builder)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
