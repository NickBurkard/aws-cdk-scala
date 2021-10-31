package io.burkard.cdk.services.lakeformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnWildcardProperty {

  def apply(
    excludedColumnNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.Builder)
      .excludedColumnNames(excludedColumnNames.map(_.asJava).orNull)
      .build()
}
