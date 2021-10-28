package io.burkard.cdk.services.lakeformation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnWildcardProperty {

  def apply(
    excludedColumnNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.Builder)
      .excludedColumnNames(excludedColumnNames.map(_.asJava).orNull)
      .build()
}
