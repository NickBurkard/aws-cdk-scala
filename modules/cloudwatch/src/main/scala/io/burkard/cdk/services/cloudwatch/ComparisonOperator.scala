package io.burkard.cdk.services.cloudwatch

sealed abstract class ComparisonOperator(val underlying: software.amazon.awscdk.services.cloudwatch.ComparisonOperator)
  extends Product
    with Serializable

object ComparisonOperator {
  implicit def toAws(value: ComparisonOperator): software.amazon.awscdk.services.cloudwatch.ComparisonOperator =
    Option(value).map(_.underlying).orNull

  case object GreaterThanOrEqualToThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.GREATER_THAN_OR_EQUAL_TO_THRESHOLD)

  case object GreaterThanThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.GREATER_THAN_THRESHOLD)

  case object GreaterThanUpperThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.GREATER_THAN_UPPER_THRESHOLD)

  case object LessThanLowerOrGreaterThanUpperThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD)

  case object LessThanLowerThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_LOWER_THRESHOLD)

  case object LessThanOrEqualToThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_OR_EQUAL_TO_THRESHOLD)

  case object LessThanThreshold
    extends ComparisonOperator(software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_THRESHOLD)
}
