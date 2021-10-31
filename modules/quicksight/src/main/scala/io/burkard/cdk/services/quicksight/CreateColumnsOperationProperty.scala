package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreateColumnsOperationProperty {

  def apply(
    columns: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.CreateColumnsOperationProperty.Builder)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
